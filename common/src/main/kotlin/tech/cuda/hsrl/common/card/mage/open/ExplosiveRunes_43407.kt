package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveRunes_43407 : Card() {
    override val id = 43407
    override val name = "爆炸符文"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，对该随从造成 6点伤害，超过其生命值的伤害将由对方英雄 承受。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "有时候去读警告标识可能更加危险。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d50e2cf1cded244884cb69162f54f2cc87a87645d7cda3646d1f837ea9bd8577.png"
}
