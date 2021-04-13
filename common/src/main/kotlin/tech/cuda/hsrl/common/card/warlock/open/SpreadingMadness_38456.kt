package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpreadingMadness_38456 : Card() {
    override val id = 38456
    override val name = "狂乱传染"
    override val description = "造成 9点伤害，随机分配到所有角色身上。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "不少夜色镇的居民相信只要戴上口罩就能有效预防传染，从而导致口罩价格迅速上涨。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f1e3173928d5855c6a6482afa953f50504c9942ed7693faf9612b6e008f896b.png"
}
