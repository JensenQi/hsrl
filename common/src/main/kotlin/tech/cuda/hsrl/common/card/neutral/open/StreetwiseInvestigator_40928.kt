package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StreetwiseInvestigator_40928 : Card() {
    override val id = 40928
    override val name = "街头调查员"
    override val description = "<b>战吼：</b>使所有敌方随从失去<b>潜行</b>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "嗯……我有一种强烈的预感。此时此刻在加基森的某个角落有犯罪活动，我要去查个清楚。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8be1a0b8f5cd5d65d365d4a17563bd192500335ee05057de2c80608bff658bbe.png"
}
