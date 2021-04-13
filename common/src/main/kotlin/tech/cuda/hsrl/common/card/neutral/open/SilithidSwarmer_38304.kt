package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilithidSwarmer_38304 : Card() {
    override val id = 38304
    override val name = "异种群居蝎"
    override val description = "在本回合中，除非你的英雄进行过攻击，否则无法进行攻击。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "如果你的英雄不先动手的话，它们就得改名叫“异种观察蝎”了。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4ac59ab086eb91515a441967357fb8b4ca46c447a525d6920e603741e899eb40.png"
}
