package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrBoomMadGenius_48146 : Card() {
    override val id = 48146
    override val name = "“科学狂人”砰砰博士"
    override val description = "<b>战吼：</b>在本局对战的剩余时间内，你的所有机械获得 <b>突袭</b>。"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我疯了，也变强了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63c5d6f4fc774fde653caea4f90c5db3f788959845d5fcf976001d28c3334cad.png"
}
