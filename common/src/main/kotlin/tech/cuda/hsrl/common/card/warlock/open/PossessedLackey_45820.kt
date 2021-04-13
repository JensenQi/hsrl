package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PossessedLackey_45820 : Card() {
    override val id = 45820
    override val name = "着魔男仆"
    override val description = "<b>亡语：</b> <b>招募</b>一个恶魔。"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他曾经只是个男仆，但后来被拖欠了工资。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/455e4be509ea5a39f139ee7072572af3efc35e38e9da00eed6fdba9861f242dc.png"
}
