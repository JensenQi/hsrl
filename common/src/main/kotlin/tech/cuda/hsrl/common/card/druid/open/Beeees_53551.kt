package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Beeees_53551 : Card() {
    override val id = 53551
    override val name = "蜂群来袭"
    override val description = "选择一个随从。召唤四只1/1的蜜蜂攻击该随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "如果手速够快，就能掌控这群飞舞的野蜂。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f653b472a11f1a320b0802b51df64c941222e70b617fb55515ab06ce2e97bf0.png"
}
