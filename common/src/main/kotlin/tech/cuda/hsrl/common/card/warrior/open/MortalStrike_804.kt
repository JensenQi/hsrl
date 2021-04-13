package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MortalStrike_804 : Card() {
    override val id = 804
    override val name = "致死打击"
    override val description = "造成 4点伤害；如果你的生命值小于或等于12点，则改为造成 6点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“如果你只有一个技能可以用，就用致死打击。”——《战士信条》，第6行"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/386e961ee51a2dc311e2155797abc32ada49b0a72cbfab40b45f66c08066828a.png"
}
