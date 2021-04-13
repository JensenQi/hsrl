package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChitteringTunneler_41875 : Card() {
    override val id = 41875
    override val name = "聒噪的挖掘者"
    override val description = "<b>战吼：</b> <b>发现</b>一张法术牌。对你的英雄造成等同于其法力值消耗的伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "幸好到目前为止，还没有法力值过大的法术…"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84255d0295c29cd7f00f0a07e5f2cdb132ecad1436f630c01c7468cac8467897.png"
}
