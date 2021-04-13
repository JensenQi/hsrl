package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoppertailImposter_49233 : Card() {
    override val id = 49233
    override val name = "伪装机器人"
    override val description = "<b>战吼：</b>获得<b>潜行</b>直到你的下个回合。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "伪装得惟妙惟肖，直到它开始收集坚果和……螺栓。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e77112a94d40e3e46bfdfeefec60c22f6e6f7d127b7fcd65f445f68791683b77.png"
}
