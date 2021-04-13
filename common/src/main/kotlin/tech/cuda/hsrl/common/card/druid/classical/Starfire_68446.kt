package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Starfire_68446 : Card() {
    override val id = 68446
    override val name = "星火术"
    override val description = "造成 5点伤害。抽一张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "平衡对德鲁伊来说很重要。这张卡牌现在就很平衡了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/803f089f494e2631443c46010f8bda68fd79f78e52236ee49ec9ae879fe818ab.png"
}
