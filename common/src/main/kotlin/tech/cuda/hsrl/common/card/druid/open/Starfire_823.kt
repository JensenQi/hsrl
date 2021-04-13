package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Starfire_823 : Card() {
    override val id = 823
    override val name = "星火术"
    override val description = "造成 5点伤害。抽一张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "平衡对德鲁伊来说很重要。这张卡牌现在就很平衡了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16ea2f718b8610ce9a87151d66f976d8198388bce281f9a4252abe98148d43c3.png"
}
