package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoguCultist_54291 : Card() {
    override val id = 54291
    override val name = "魔古信徒"
    override val description = "<b>战吼：</b>如果你的场上满是魔古信徒，则将其全部献祭，并召唤“莱，至高守护者”。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "魔古信徒的团建活动可太要命了。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0e4995f9309c4c60f056be8f92e89a689e9cb30fde63a3c102ef0d01f5bd71e.png"
}
