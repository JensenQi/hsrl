package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BewitchedGuardian_46903 : Card() {
    override val id = 46903
    override val name = "失魂的守卫"
    override val description = "<b>嘲讽，战吼：</b> 你每有一张手牌，便获得+1生命值。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "丢了魂又怎样，至少我长得英明神武！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0743f141f7e54792f5ff05a5471a788e748167bab21326e5ce3b11152974e16b.png"
}
