package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ObsidianShard_41213 : Card() {
    override val id = 41213
    override val name = "黑曜石碎片"
    override val description = "每使用一张 另一职业的卡牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "因为职业病的关系，潜行者只要看到尖锐的硬物就想拿来当匕首。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b378b63b6a4f9fb368a6c652c3579597b3d7661e36626c583c555f381a02bf56.png"
}
