package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hex_68455 : Card() {
    override val id = 68455
    override val name = "妖术"
    override val description = "使一个随从变形成为一只0/1并具有<b>嘲讽</b>的青蛙。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你对一个鱼人使用妖术...其实结果也没什么变化，对不对？"
    override val artist = "Steve Hui"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f659ba59f2b56a739810d0bce30325243a09198d492bab287d1d0c1e37e59dff.png"
}
