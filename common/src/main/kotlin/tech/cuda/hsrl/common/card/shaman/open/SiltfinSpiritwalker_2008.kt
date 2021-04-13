package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiltfinSpiritwalker_2008 : Card() {
    override val id = 2008
    override val name = "沙鳞灵魂行者"
    override val description = "每当有其他友方鱼人死亡，便抽一张牌。 <b>过载：</b>（1）"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "任何人只要对元素提出合理的诉求，元素都会回应你。哪怕你只是想喊一句：“哦哇啦咯哇咯咯哦！”"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/98a31dc0022ebad8632a1ebf91f73f5b91315ccbc3022844ec0dce161e571021.png"
}
