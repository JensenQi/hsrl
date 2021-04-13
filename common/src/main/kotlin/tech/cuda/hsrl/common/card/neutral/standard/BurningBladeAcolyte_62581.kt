package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BurningBladeAcolyte_62581 : Card() {
    override val id = 62581
    override val name = "火刃侍僧"
    override val description = "<b>亡语：</b>召唤一个5/8并具有<b>嘲讽</b>的恶魔生物。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "刀刃上竟然没有火，扫兴。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3bf2f76ff105bee0b07981b37672d4cb1b1d220a69daf64344ac907dae54a153.png"
}
