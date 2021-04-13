package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TerrorscaleStalker_41304 : Card() {
    override val id = 41304
    override val name = "恐鳞追猎者"
    override val description = "<b>战吼：</b>触发一个友方随从的<b>亡语</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "他捉弄朋友的方式就是大吼一声，吓得对方半条命都没了。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ed2bf8fa18dcbd8008d892af773f21c391831345310e7055c5f2bac663db477.png"
}
