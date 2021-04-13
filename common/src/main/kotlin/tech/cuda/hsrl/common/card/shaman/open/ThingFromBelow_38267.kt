package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThingFromBelow_38267 : Card() {
    override val id = 38267
    override val name = "深渊魔物"
    override val description = "<b>嘲讽</b> 在本局对战中，你每召唤一个图腾，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "深渊魔物有一奇怪的癖好，就是收集各式各样的萨满祭司图腾。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97b22bd0a69d4fbe0bcd499f41020488f4d2d3bf0ad43d9630e0de51292b1a89.png"
}
