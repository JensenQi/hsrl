package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LotusAgents_40742 : Card() {
    override val id = 40742
    override val name = "玉莲帮密探"
    override val description = "<b>战吼：</b><b>发现</b>一张德鲁伊、潜行者或萨满祭司卡牌。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "男女搭配，干活不累。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f2e659ef3ac70e30c3235a890bdcb32733572d0922398c86fedc7254d314267.png"
}
