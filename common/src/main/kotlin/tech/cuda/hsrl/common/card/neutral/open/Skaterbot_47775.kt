package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Skaterbot_47775 : Card() {
    override val id = 47775
    override val name = "滑板机器人"
    override val description = "<b>磁力</b> <b>突袭</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我的滑板车时尚时尚最时尚。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/accb6ce895b3915f7d17363ea8006aaa1d1779c7910cf128249c34865691d2ff.png"
}
