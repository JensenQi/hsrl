package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NestingRoc_41305 : Card() {
    override val id = 41305
    override val name = "筑巢双头鹏"
    override val description = "<b>战吼：</b>如果你控制至少两个其他随从，便获得<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "双头鹏会用蛋来诱捕那些偷蛋贼。正所谓螳螂捕蝉，大鹏在后。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/059618181194f908639279c81e6360a2b145dce7904e1f9c967d6b4e2fd249a0.png"
}
