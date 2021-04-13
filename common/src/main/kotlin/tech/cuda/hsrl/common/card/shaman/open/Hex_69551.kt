package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hex_69551 : Card() {
    override val id = 69551
    override val name = "妖术"
    override val description = "使一个随从变形成为一只0/1并具有<b>嘲讽</b>的青蛙。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "如果你对一个鱼人使用妖术...其实结果也没什么变化，对不对？"
    override val artist = "Steve Hui"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/adef72b5395d6b4c0af7c24989bb4559fa0265434d8fef09d9d9d7ac53a80dbd.png"
}
