package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Riftcleaver_53887 : Card() {
    override val id = 53887
    override val name = "裂隙屠夫"
    override val description = "<b>战吼：</b>消灭一个随从。你的英雄受到等同于该随从生命值的 伤害。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "以血还血！只不过还在了你身上……"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0e207514124aff7fb673824625b04b596aaa29d10ed4d6f6f34c985d3aa28c5.png"
}
