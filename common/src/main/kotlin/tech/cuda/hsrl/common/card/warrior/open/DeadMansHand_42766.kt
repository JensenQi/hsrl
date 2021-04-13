package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadMansHand_42766 : Card() {
    override val id = 42766
    override val name = "亡者之牌"
    override val description = "复制你的手牌并洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "我有一对拉格纳罗斯和一对铸甲师。你呢？"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/206d61d9b6d856f3deb5847ee24f24ae49cff65a0bee7030259a7a850394b783.png"
}
