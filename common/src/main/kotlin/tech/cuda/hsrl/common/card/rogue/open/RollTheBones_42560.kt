package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RollTheBones_42560 : Card() {
    override val id = 42560
    override val name = "命运骨骰"
    override val description = "抽一张牌。如果这张牌具有<b>亡语</b>，则再次施放该法术。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "说吧，你选字还是花…"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c08aa75b3e2d6cc2206c894dc2651b237764699f479acfda07847dcc328426f.png"
}
