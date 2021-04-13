package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GameMaster_61178 : Card() {
    override val id = 61178
    override val name = "游戏管理员"
    override val description = "你每个回合使用的第一张<b>奥秘</b>牌法力值消耗为（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“这时候，你听到了鱼人愤怒的叫声在向你接近。骰先攻吧！”"
    override val artist = "J. Cheung & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b43fc26e133acd3aed02f40985078543ef0ac1b298d25559eee5ab3f1b88ce5.png"
}
