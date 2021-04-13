package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FoolsBane_39417 : Card() {
    override val id = 39417
    override val name = "愚者之灾"
    override val description = "每个回合攻击次数不限，但无法攻击英雄。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Karazhan
    override val background = "傻人不一定有傻福。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/46be7fa33b8680a5bb30106197cb21c2422261fe6b14a84d8f70b685b13ff055.png"
}
