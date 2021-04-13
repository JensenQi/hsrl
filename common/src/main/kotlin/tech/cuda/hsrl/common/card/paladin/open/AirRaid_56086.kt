package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AirRaid_56086 : Card() {
    override val id = 56086
    override val name = "空中团战"
    override val description = "<b>双生法术</b> 召唤两个1/1并具有<b>嘲讽</b>的白银之手新兵。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "发起一场空中团战真的很难。你要凑齐二十五个人，还得是二十五个圣骑士！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/170242c0fc32c4a401937a82a63e5a914ec622892a0845a56e0a971e329faf5f.png"
}
