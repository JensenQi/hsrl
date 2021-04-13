package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidCrusher_2537 : Card() {
    override val id = 2537
    override val name = "虚空碾压者"
    override val description = "<b>激励：</b>随机消灭每个玩家的一个随从。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "或许他跟卫斯理笔下的蓝血人有那么点关系。"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3815c74ef4a0d1b03d2f8498f48abc46f07c2f07649cea0ebe3dcadd62fb4c9.png"
}
