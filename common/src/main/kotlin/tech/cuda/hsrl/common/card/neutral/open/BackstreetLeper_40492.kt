package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BackstreetLeper_40492 : Card() {
    override val id = 40492
    override val name = "后街男巫"
    override val description = "<b>亡语：</b>对敌方英雄造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "那些胆敢嘲笑他样貌的人，他都会回敬一瓶强酸药水。"
    override val artist = "Yewon Park"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9035eb09b5db78a188b03d736c2154d0237118d61370d35072b34479fb415baf.png"
}
