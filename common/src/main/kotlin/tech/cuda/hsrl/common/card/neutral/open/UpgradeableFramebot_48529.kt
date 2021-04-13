package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UpgradeableFramebot_48529 : Card() {
    override val id = 48529
    override val name = "可升级机器人"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "注：只有购买升级套餐才能获得左臂。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c05607a2b5b06f511d0de684243e5c95bf986f858803b8e39d44231bc554ce3.png"
}
