package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wrathion_40603 : Card() {
    override val id = 40603
    override val name = "拉希奥"
    override val description = "<b>嘲讽，战吼：</b>抽若干数量的牌，直到你抽到一张非龙牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "什么？身为死亡之翼的儿子，拉希奥居然不是龙牌？你似乎知道得太多了…"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c4e8b09e02dd9b1a2cf24de7cc33841db2e53d41ac40aa80f7dbf7159a5580a.png"
}
