package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrotesqueDragonhawk_38533 : Card() {
    override val id = 38533
    override val name = "畸变的龙鹰"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "人们总说“外形不重要，主要看气质”，可要是他们看过畸变的龙鹰就不会这么想了。真的好恶心！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c723512829edf56417c43cdde31cfc16e3cdf7bd5a1fa919d688a9dd3dc76633.png"
}
