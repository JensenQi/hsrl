package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MortalStrike_69953 : Card() {
    override val id = 69953
    override val name = "致死打击"
    override val description = "造成 4点伤害；如果你的生命值小于或等于12点，则改为造成 6点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“如果你只有一个技能可以用，就用致死打击。”——《战士信条》，第6行"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b70aba66e2a3337d9cf840b33e0ca98a1e463fd8bc3546a988b2ac39ad5846f.png"
}
