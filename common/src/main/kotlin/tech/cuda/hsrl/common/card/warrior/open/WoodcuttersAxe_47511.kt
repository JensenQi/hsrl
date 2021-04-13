package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WoodcuttersAxe_47511 : Card() {
    override val id = 47511
    override val name = "樵夫之斧"
    override val description = "<b>亡语：</b>随机使一个友方<b>突袭</b>随从获得+2/+1。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "金斧银斧不如自己的铁斧。"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f36228156d5e78c2d4ce277db8e5a34b601297a26c681c84a827490d3d0a6218.png"
}
