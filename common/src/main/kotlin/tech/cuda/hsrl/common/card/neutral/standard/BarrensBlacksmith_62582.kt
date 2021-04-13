package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarrensBlacksmith_62582 : Card() {
    override val id = 62582
    override val name = "贫瘠之地铁匠"
    override val description = "<b>暴怒：</b>使你的其他随从获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“或许有一天，你也能混到加基森去呢，孩子。”"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c25c9acdb78c7b1661c5b12491fa0a90e92aaeb3cc46dc995d24580fa5b8c53a.png"
}
