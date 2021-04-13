package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Umberwing_56587 : Card() {
    override val id = 56587
    override val name = "棕红之翼"
    override val description = "<b>战吼：</b>召唤两只1/1的邪翼蝠。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "这大概是恶魔猎手眼中的棕红色。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f56b5ed3e0ba77290738828abb51b81752087ae79d54da04ab9ea4666dd72290.png"
}
