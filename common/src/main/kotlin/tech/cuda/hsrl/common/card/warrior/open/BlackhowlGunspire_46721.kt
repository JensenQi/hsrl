package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackhowlGunspire_46721 : Card() {
    override val id = 46721
    override val name = "黑嚎炮塔"
    override val description = "无法攻击。每当该随从受到伤害时，随机对一个敌人造成3点 伤害。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "要什么窗户？巨塔大炮才是男人的浪漫！"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28451a0087fae1d5ee219fa301baa37bdcc405bd965b2f742589de1522e9584a.png"
}
