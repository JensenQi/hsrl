package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrothingBerserker_654 : Card() {
    override val id = 654
    override val name = "暴乱狂战士"
    override val description = "每当一个随从 受到伤害，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "在投身狂战士这份很有前途的工作之前，他是一个会计。"
    override val artist = "Simon Bisley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/98b260daee0236b749427a02216a3f5cd6f921c85f1075d62eb3b4d81d4f176c.png"
}
