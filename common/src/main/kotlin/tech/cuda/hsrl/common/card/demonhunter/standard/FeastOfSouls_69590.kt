package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeastOfSouls_69590 : Card() {
    override val id = 69590
    override val name = "灵魂盛宴"
    override val description = "在本回合中每有一个友方随从死亡，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "想抓住恶魔猎手的胃，先抓住恶魔的魂。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc59b2899521f0ab89f241a5c35544f7ec6019553cdaaa9718894bb4b9fc1bf0.png"
}
