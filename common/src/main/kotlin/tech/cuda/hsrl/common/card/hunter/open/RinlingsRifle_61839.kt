package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RinlingsRifle_61839 : Card() {
    override val id = 61839
    override val name = "瑞林的步枪"
    override val description = "在你的英雄攻击后，<b>发现</b>一张<b>奥秘</b>牌并将其 施放。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "这把枪的枪管需要好好管一管。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68319a169b5b064c9a0010a134371f700cc4c2e74a7a1d84451ee55811d1af38.png"
}
