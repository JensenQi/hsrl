package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrothingBerserker_69645 : Card() {
    override val id = 69645
    override val name = "暴乱狂战士"
    override val description = "每当一个随从 受到伤害，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "在投身狂战士这份很有前途的工作之前，他是一个会计。"
    override val artist = "Simon Bisley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ce3980885c9ebfa5d105ee8e209a4e3879d32905f14a8cd6afc5a83c6dd2de0.png"
}
