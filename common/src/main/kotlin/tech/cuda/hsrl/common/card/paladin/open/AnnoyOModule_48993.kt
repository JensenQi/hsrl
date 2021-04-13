package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnnoyOModule_48993 : Card() {
    override val id = 48993
    override val name = "吵吵模组"
    override val description = "<b>磁力</b> <b>圣盾</b> <b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "每隔十秒就会弹出一次，问你要不要更新。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/afb4690518c1fe6625445f26fe131dd7fddb5676cb3326383c263afb1b2676d4.png"
}
