package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrothingBerserker_70046 : Card() {
    override val id = 70046
    override val name = "暴乱狂战士"
    override val description = "每当一个随从 受到伤害，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "在投身狂战士这份很有前途的工作之前，他是一个会计。"
    override val artist = "Simon Bisley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/035469e807573190b7cce6fd816934ea77674bb0f2329a9614a4fc2473e6521e.png"
}
