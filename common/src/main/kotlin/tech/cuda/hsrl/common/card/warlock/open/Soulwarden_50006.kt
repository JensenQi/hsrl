package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Soulwarden_50006 : Card() {
    override val id = 50006
    override val name = "护魂者"
    override val description = "<b>战吼：</b>随机将三张你在本局对战中弃掉的牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "弃牌不是无情术，化作手牌更护魂。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb766186a58165dd38eb80c914cdefaf13bf4576d75a0b2e98f6c3373a6b903b.png"
}
