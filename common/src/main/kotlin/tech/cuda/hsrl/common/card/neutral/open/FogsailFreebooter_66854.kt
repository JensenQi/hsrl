package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FogsailFreebooter_66854 : Card() {
    override val id = 66854
    override val name = "雾帆劫掠者"
    override val description = "<b>战吼：</b>如果你装备着武器，造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "穿搭廉价，省下的钱都用在了武器上。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3fa0318411d92b808b56757eb1fddb2f8374c8b576b3a28f15b677ae09e9431b.png"
}
