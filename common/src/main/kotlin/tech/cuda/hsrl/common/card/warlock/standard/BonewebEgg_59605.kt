package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BonewebEgg_59605 : Card() {
    override val id = 59605
    override val name = "骨网之卵"
    override val description = "<b>亡语：</b>召唤两只2/1的蜘蛛。如果你弃掉这张牌，触发其<b>亡语</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "今年找彩蛋的时候一定特别刺激！"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96fba0c41aba920e60b6b2178aa0c1e45133139902ae8084986953122d906892.png"
}
