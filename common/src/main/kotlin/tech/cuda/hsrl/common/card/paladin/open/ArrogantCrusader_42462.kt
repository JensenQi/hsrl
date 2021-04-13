package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArrogantCrusader_42462 : Card() {
    override val id = 42462
    override val name = "傲慢的十字军"
    override val description = "<b>亡语：</b>如果此时是你对手的回合，则召唤一个2/2的食尸鬼。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "说真的，要不是他能引来那只食尸鬼，这家伙就是个混球。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/035ac3ef297f1cbe8c101f92c515de8061275f0901ab02614e843a18bb68723a.png"
}
