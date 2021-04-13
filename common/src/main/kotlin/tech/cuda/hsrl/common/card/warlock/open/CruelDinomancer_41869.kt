package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CruelDinomancer_41869 : Card() {
    override val id = 41869
    override val name = "残暴的恐龙术士"
    override val description = "<b>亡语：</b>随机召唤一个你在本局对战中弃掉的随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "一旦你选择了这个行当，就别指望交什么朋友了。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b92b2b3aee05de3f20a7ac8ac4d2d4175288f293b5951f5c79cc45c98120968b.png"
}
