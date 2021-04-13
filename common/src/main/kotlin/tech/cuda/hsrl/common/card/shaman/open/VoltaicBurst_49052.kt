package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoltaicBurst_49052 : Card() {
    override val id = 49052
    override val name = "流电爆裂"
    override val description = "召唤两个1/1并具有<b>突袭</b>的“火花”。<b>过载：</b>（1）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "电路负载过多就成了过载。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a6551b4610094088dd86e29dd59b796a267d06a806fc0af06f3f93450ab07f26.png"
}
