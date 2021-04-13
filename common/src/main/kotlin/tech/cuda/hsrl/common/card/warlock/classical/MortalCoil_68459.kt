package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MortalCoil_68459 : Card() {
    override val id = 68459
    override val name = "死亡缠绕"
    override val description = "对一个随从造成 1点伤害。如果“死亡缠绕”消灭该随从，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "很久以前，术士们发现只要在普通的法术中加入一点令人作呕的颜色，就能在伤害敌人的同时使其恐惧。真是一举两得。"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/781dbada60bdccc341b5f140aed4c409a956aa4bba123a52f4e36d1b99d509a7.png"
}
