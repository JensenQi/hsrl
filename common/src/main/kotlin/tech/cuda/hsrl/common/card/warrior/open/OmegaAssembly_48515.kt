package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OmegaAssembly_48515 : Card() {
    override val id = 48515
    override val name = "欧米茄装配"
    override val description = "<b>发现</b>一张机械牌。如果你有十个法力水晶，保留全部三张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "砰砰博士表示让他三选一是不可能的，这辈子都不可能。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/af27e78a4c0b1d40ca39052a5279c53c13a44f5dfdcdce25f1ed649e7bfe98f2.png"
}
