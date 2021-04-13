package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InjuredMarauder_62548 : Card() {
    override val id = 62548
    override val name = "受伤的掠夺者"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>对该随从造成6点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 10
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不好，健康马变红了！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/07418947f765fa302b2bd5bc78a860cf7ae58e31f293df08fb7ecf829738a6b7.png"
}
